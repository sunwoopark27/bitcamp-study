package com.eomcs.io.ex05;

import java.io.FileOutputStream;
import java.io.IOException;

public class Atest extends FileOutputStream {
  public Atest(String filename) throws Exception {
    super(filename);
  }
  byte[] buf = new byte[8192];
  int cursor;

  @Override
  public void write(int b) throws IOException {
    if(cursor == buf.length) {
      super.write(buf);
      cursor = 0;
    }

    buf[cursor++] = (byte) b;
  }

  @Override
  public void close() throws IOException {
    this.flush();
    super.close();
  }

  @Override
  public void flush() throws IOException {
    if(cursor > 0) {
      this.write(buf, 0, cursor);
      cursor = 0;
    }
  }
}
