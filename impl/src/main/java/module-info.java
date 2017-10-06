module java9.spring.boot.impl {
    requires java9.spring.boot.api;

    provides com.hyojinbae.sample.java9.spring.boot.api.GreetingService
            with com.hyojinbae.sample.java9.spring.boot.impl.HelloImpl;
}