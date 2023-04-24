/*
 * Copyright (c) 2023 Macula
 *   macula.dev, China
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.macula.boot.starter.seata.web;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;

/**
 * {@code SeataHandlerInterceptorAutoConfiguration} Web Handler自动配置
 *
 * @author rain
 * @since 2023/4/23 13:59
 */
@AutoConfiguration
public class SeataHandlerInterceptorAutoConfiguration {
    @Bean
    @ConditionalOnWebApplication
    SeataHandlerInterceptorWebMvcConfigurer seataHandlerInterceptor() {
        return new SeataHandlerInterceptorWebMvcConfigurer();
    }
}
