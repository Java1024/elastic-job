/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.lite.lifecycle.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class ExecutionStatusTest {
    
    @Test
    public void assertGetExecutionStatusWhenIsRunning() {
        assertThat(ExecutionInfo.ExecutionStatus.getExecutionStatus(true, false), is(ExecutionInfo.ExecutionStatus.RUNNING));
    }
    
    @Test
    public void assertGetExecutionStatusWhenIsCompleted() {
        assertThat(ExecutionInfo.ExecutionStatus.getExecutionStatus(false, true), is(ExecutionInfo.ExecutionStatus.COMPLETED));
    }
    
    @Test
    public void assertGetExecutionStatusWhenIsPending() {
        assertThat(ExecutionInfo.ExecutionStatus.getExecutionStatus(false, false), is(ExecutionInfo.ExecutionStatus.PENDING));
    }
}
