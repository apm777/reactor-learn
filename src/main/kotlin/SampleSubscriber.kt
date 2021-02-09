import org.reactivestreams.Subscription
import reactor.core.publisher.BaseSubscriber
import java.util.concurrent.Flow

class SampleSubscriber<T>: BaseSubscriber<T>(){
    override fun hookOnSubscribe(subscription: Subscription) {
        println("Subscribed")
        request(1)
    }

    override fun hookOnNext(value: T) {
        println(value)
        request(1)
    }
}