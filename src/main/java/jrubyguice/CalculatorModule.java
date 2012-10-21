package jrubyguice;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.runtime.Block;
import org.jruby.runtime.builtin.IRubyObject;

public class CalculatorModule extends AbstractModule{
    @Override protected void configure() {
        bind(Calculator.class).toProvider(new Provider<Calculator>() {
            @Override public Calculator get() {
                Ruby ruby = Ruby.getGlobalRuntime();
                ruby.evalScriptlet("require 'calculator'");
                RubyClass calculatorClass = ruby.getClass("Calculator");
                IRubyObject iRubyObject = calculatorClass.newInstance(ruby.getCurrentContext(), Block.NULL_BLOCK);
                return (Calculator) iRubyObject.toJava(Calculator.class);
            }
        });
    }
}
