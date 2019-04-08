/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.language.java.tasks;

import org.gradle.api.Incubating;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.jvm.platform.JavaPlatform;
import org.gradle.jvm.toolchain.JavaToolChain;

import javax.inject.Inject;

/**
 * A platform-aware Java compile task.
 */
@Incubating
public class PlatformJavaCompile extends JavaCompile {
    private JavaPlatform platform;

    @Override
    public JavaPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(JavaPlatform platform) {
        this.platform = platform;
    }

    @Inject
    @Override
    public JavaToolChain getToolChain() {
        throw new UnsupportedOperationException();
    }
}