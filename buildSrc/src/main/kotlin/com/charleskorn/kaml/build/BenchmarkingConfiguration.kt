/*

   Copyright 2018-2019 Charles Korn.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package com.charleskorn.kaml.build

import me.champeau.gradle.JMHPlugin
import me.champeau.gradle.JMHPluginExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

fun Project.configureBenchmarking() {
    apply<JMHPlugin>()

    configure<JMHPluginExtension> {
        benchmarkMode = listOf("avgt")
        timeUnit = "us"
        iterations = 5
        timeOnIteration = "2s"
        warmupIterations = 0
        fork = 1
    }
}
