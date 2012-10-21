package jrubyguice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorModuleTest {
    @Test
    public void shouldCreateAModuleWithCalculator() {
        Injector injector = Guice.createInjector(new CalculatorModule());

        Calculator instance = injector.getInstance(Calculator.class);

        assertThat(instance.plus(1, 2), equalTo(3));
    }
}
