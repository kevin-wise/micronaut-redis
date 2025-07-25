/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.configuration.lettuce;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Requires;
import io.micronaut.core.util.StringUtils;

/**
 * In the case where the {@code redis.uri} is not specified use the default configuration.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@ConfigurationProperties(RedisSetting.PREFIX)
@Primary
@Requires(property = RedisSetting.PREFIX)
@Requires(property = RedisSetting.PREFIX + ".enabled", notEquals = StringUtils.FALSE)
public class DefaultRedisConfiguration extends AbstractRedisConfiguration {
}
