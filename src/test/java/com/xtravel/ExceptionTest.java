package com.xtravel;

import com.xtravel.exception.TestChildException;
import com.xtravel.exception.TestException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class ExceptionTest {
    /**
     * 测试父子异常捕获机制
     */
    @Test
    public void testException2(){
        //try {
        //    throw new TestChildException("1111");
        //} catch (TestException e) {
        //    log.error("TestException", e);
        //}  catch (Exception e) {
        //    log.error("Exception", e);
        //}

        try {
            try {
                throw new TestChildException("1111");
            } catch (TestException e) {
                throw e;
            }
        } catch (TestChildException e) {
            log.error("TestChildException", e);
        } catch (TestException e) {
            log.error("TestException", e);
        }  catch (Exception e) {
            log.error("Exception", e);
        }
    }

    /**
     * 测试运行时异常和非运行时异常的强制捕获或声明机制
     */
    @Test
    public void testException(){
        doTestException();
    }

    /**
     * 非受检异常编译器不会强制要求捕获处理或者向外声明,既是声明了,外部方法也不需要处理
     * 受检异常则相反,编译器会强制要求捕获处理或者向外声明,并且外部方法必须处理或继续向外声明
     */
    private void doTestException() {
        try {
            throw new IOException("0000");
        } catch (Exception e) {

        }
        //throw new InterruptedException("1111");
        throw new RuntimeException("1111");
    }
}

























