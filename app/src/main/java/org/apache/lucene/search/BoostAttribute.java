package org.apache.lucene.search;

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

import org.apache.lucene.util.Attribute;


/** Add this {@link org.apache.lucene.util.Attribute} to a {@link org.apache.lucene.index.TermsEnum} returned by {@link MultiTermQuery#getTermsEnum(org.apache.lucene.index.Terms, org.apache.lucene.util.AttributeSource)}
 * and update the boost on each returned term. This enables to control the boost factor
 * for each matching term in {@link MultiTermQuery#SCORING_BOOLEAN_QUERY_REWRITE} or
 * {@link TopTermsRewrite} mode.
 * {@link FuzzyQuery} is using this to take the edit distance into account.
 * <p><b>Please note:</b> This attribute is intended to be added only by the TermsEnum
 * to itself in its constructor and consumed by the {@link MultiTermQuery.RewriteMethod}.
 * @lucene.internal
 */
public interface BoostAttribute extends Attribute {
  /** Sets the boost in this attribute */
  public void setBoost(float boost);
  /** Retrieves the boost, default is {@code 1.0f}. */
  public float getBoost();
}
