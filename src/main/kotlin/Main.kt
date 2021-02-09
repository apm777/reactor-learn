import reactor.core.publisher.Flux

fun main() {

//    Создание Flux
//    val seq1 = Flux.just("foo", "bar", "foobar")
//        .log()
//    seq1.subscribe { e -> println(e) }

//    Создание Flux из массива
//    val iterable = arrayOf("foo", "bar", "foobar")
//    Flux.fromArray(iterable)
//        .log()
//        .subscribe { e -> println(e) }

//    Создание Flux из Range
//    val ints = Flux.range(1, 5)
//        .log()
//        .map { e -> e * e }
//
//    ints.subscribe { e -> println(e) }

//    Выводит элементы и ошибку
    val ints = Flux.range(1, 4)
        .map { i -> if (i <= 3) i else throw RuntimeException("Got to 4") }
        .log()

    ints.subscribe(
        { i -> println(i) },
        { error -> println("Error: $error") }
    )

}
