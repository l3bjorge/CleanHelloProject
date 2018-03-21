package es.ulpgc.eite.clean.mvp.sample.app;

import es.ulpgc.eite.clean.mvp.sample.bye.Bye;
import es.ulpgc.eite.clean.mvp.sample.dummy.Dummy;
import es.ulpgc.eite.clean.mvp.sample.hello.Hello;

/**
 * Created by imac on 23/1/18.
 */

public interface Mediator {

  interface Lifecycle {
    void startingScreen(Bye.HelloToBye presenter);

    void startingScreen(Hello.ToHello presenter);
    void resumingScreen(Hello.ByeToHello presenter);

    void startingScreen(Dummy.ToDummy presenter);
    void resumingScreen(Dummy.DummyTo presenter);

  }

  interface Navigation {
    void goToNextScreen(Dummy.DummyTo presenter);
    void backToPreviousScreen(Dummy.DummyTo presenter);

    void goToByeScreen(Hello.HelloToBye presenter);
    void goToHelloScreen(Bye.ByeToHello presenter);
    void updateState(String text);

  }
}
