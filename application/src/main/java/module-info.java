module java9.spring.boot.application {
    requires java9.spring.boot.api;
    exports com.hyojinbae.sample.java9.spring.boot; //つけないとruntime imageで実行できない?

    uses com.hyojinbae.sample.java9.spring.boot.api.GreetingService;
}