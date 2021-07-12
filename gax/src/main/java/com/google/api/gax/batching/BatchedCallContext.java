/*
 * Copyright 2019 Google LLC
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google LLC nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.google.api.gax.batching;

import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;

/**
 * BatchedCallContext encapsulates context data in a batch call.
 *
 * <p>For internal use only.
 */
@InternalApi
@AutoValue
public abstract class BatchedCallContext {

  /** Gets element count of the current batch. */
  public abstract long getElementCount();

  /** Gets byte count of the current batch. */
  public abstract long getByteCount();

  /** Gets total throttled time of the current batch. */
  public abstract long getTotalThrottledTimeMs();

  @AutoValue.Builder
  public abstract static class Builder {

    public static Builder newBuilder() {
      return new AutoValue_BatchedCallContext.Builder();
    }

    /** Gets element count of the current batch. */
    public abstract Builder setElementCount(long elementCount);

    /** Gets byte count of the current batch. */
    public abstract Builder setByteCount(long byteCount);

    /** Gets total throttled time of the current batch. */
    public abstract Builder setTotalThrottledTimeMs(long throttledTimeMs);

    public abstract BatchedCallContext build();
  }
}