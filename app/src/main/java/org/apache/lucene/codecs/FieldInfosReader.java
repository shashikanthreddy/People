package org.apache.lucene.codecs;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.lucene.index.FieldInfos;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.IOContext;

import java.io.IOException;

/**
 * Codec API for reading {@link org.apache.lucene.index.FieldInfos}.
 * @lucene.experimental
 */
public abstract class FieldInfosReader {
  /** Sole constructor. (For invocation by subclass
   *  constructors, typically implicit.) */
  protected FieldInfosReader() {
  }

  /** Read the {@link org.apache.lucene.index.FieldInfos} previously written with {@link
   *  FieldInfosWriter}. */
  public abstract FieldInfos read(Directory directory, String segmentName, IOContext iocontext) throws IOException;
}
