package com.java.jikexueyuan.myiodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义IO流的一层装饰者，重新定义read方法，将读取到的数据转成大写
 * 装饰之后方法可任意嵌套，灵活修改
 */
public class UpperCaseInputStream extends FilterInputStream {

    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) (c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = 0; i < result; i++) {
            b[i] = (byte) Character.toUpperCase((char) (b[i]));
        }

        return result;
    }
}
