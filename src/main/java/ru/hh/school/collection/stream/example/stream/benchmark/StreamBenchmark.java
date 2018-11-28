package ru.hh.school.collection.stream.example.stream.benchmark;

import org.openjdk.jmh.annotations.*;
import ru.hh.school.collection.stream.example.dto.Vacancy;
import ru.hh.school.collection.stream.example.stream.calc_salary.CollectionStream;
import ru.hh.school.collection.stream.example.stream.calc_salary.CollectionWithoutStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


/**
 * Сравниваем по скорости выполнения stream, parallelStream, for на разных примерах
 * Для запуска воспользоваться классом BenchmarkRunner
 *
 * Результаты одного из запусков:
 * Benchmark                                   Mode  Cnt          Score           Error  Units
 * StreamBenchmark.sumConditionalOperatorTime  avgt   30  141108345,079 ±   9403068,906  ns/op
 * StreamBenchmark.sumBranchStatementTime      avgt   30  139612956,594 ±  11486604,729  ns/op
 * StreamBenchmark.sumParallelStreamsTime      avgt   30  338867514,000 ±  76935486,904  ns/op
 * StreamBenchmark.sumStreamsTime              avgt   30  816219110,656 ± 413719957,003  ns/op
 *
 * StreamBenchmark.filterVacancyForTime        avgt   30  285276666,171 ±  21994616,889  ns/op
 * StreamBenchmark.filterVacancyStreamTime     avgt   30  271249085,123 ±  34723197,999  ns/op
 *
 * StreamBenchmark.simpleForTime               avgt   30    1323278,497 ±     59637,799  ns/op
 * StreamBenchmark.simpleStreamTime            avgt   30    1520802,130 ±    206842,493  ns/op
 *
 * StreamBenchmark.simpleSmallForTime          avgt   30         10,445 ±         1,338  ns/op
 * StreamBenchmark.simpleSmallStreamTime       avgt   30         21,840 ±         1,382  ns/op
 */
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 10, timeUnit = TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Threads(1)
@Warmup(iterations = 5, timeUnit = TimeUnit.NANOSECONDS)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class StreamBenchmark {

    private final int TOTAL_SIZE = 32_768;
    private final int FILTER_VALUE = 1_280;
    private final int LOOP_COUNT = 10_000;

    private static final int SIZE = 1_000_000;
    private static final int SIZE_SMALL = 10;

    private int[] array;
    private static List<Integer> list = new ArrayList<>();
    private static List<Integer> listSmall = new ArrayList<>();
    private static List<Vacancy> vacancies = new ArrayList<>();

    @Setup
    public void setup() {
        array = IntStream.range(0, TOTAL_SIZE).toArray();


        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        for (int i = 0; i < SIZE_SMALL; i++) {
            listSmall.add(i);
        }

        vacancies = getVacancies();
    }

    //<sum-filter desc="Сумма с фильтрацией">
    @Benchmark
    public long sumConditionalOperatorTime() {
        long sum = 0;
        for (int j = 0; j < LOOP_COUNT; j++) {
            for (int c = 0; c < TOTAL_SIZE; ++c) {
                sum += array[c] >= FILTER_VALUE ? array[c] : 0;
            }
        }
        return sum;
    }

    @Benchmark
    public long sumBranchStatementTime() {
        long sum = 0;
        for (int j = 0; j < LOOP_COUNT; j++) {
            for (int c = 0; c < TOTAL_SIZE; ++c) {
                if (array[c] >= FILTER_VALUE) {
                    sum += array[c];
                }
            }
        }
        return sum;
    }

    @Benchmark
    public long sumStreamsTime() {
        long sum = 0;
        for (int j = 0; j < LOOP_COUNT; j++) {
            sum += IntStream.of(array).filter(value -> value >= FILTER_VALUE).sum();
        }
        return sum;
    }

    @Benchmark
    public long sumParallelStreamsTime() {
        long sum = 0;
        for (int j = 0; j < LOOP_COUNT; j++) {
            sum += IntStream.of(array).parallel().filter(value -> value >= FILTER_VALUE).sum();
        }
        return sum;
    }
    //</sum-filter>

    //<simple-small-stream desc="Простой стрим из маленького количества элементов">
    @Benchmark
    public void simpleSmallStreamTime() {
        listSmall.stream().forEach(v-> aVoid(v));
    }

    @Benchmark
    public void simpleSmallForTime() {
        for (int i = 0; i < listSmall.size(); i++) {
            aVoid(listSmall.get(i));
        }
    }
    //</simple-small-stream>

    //<simple-stream desc="Простой стрим из большого количества элементов">
    @Benchmark
    public void simpleStreamTime() {
        list.stream().forEach(v-> aVoid(v));
    }

    @Benchmark
    public void simpleForTime() {
        for (int i = 0; i < list.size(); i++) {
            aVoid(list.get(i));
        }
    }
    //</simple-stream>

    //<filter-vacancy desc="Выборка вакансий">
    @Benchmark
    public List<Integer> filterVacancyStreamTime() {
        return new CollectionStream().getVacanciesWithSalaryMore50000(vacancies);
    }

    @Benchmark
    public List<Integer> filterVacancyForTime() {
        return new CollectionWithoutStream().getVacanciesWithSalaryMore50000(vacancies);
    }
    //</filter-vacancy>

    private static List<Vacancy> getVacancies() {
        List<Vacancy> vacancies = new ArrayList<>();
        Random rand = new Random(1_000_000);
        for (int i = 0; i < SIZE; i++) {
            vacancies.add(new Vacancy(1, "test" + i, rand.nextInt()));
        }
        return vacancies;
    }

    private static void aVoid(int v) {}
}
