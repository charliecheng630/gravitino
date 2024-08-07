/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.datastrato.gravitino.catalog.jdbc.utils;

import com.datastrato.gravitino.catalog.jdbc.config.JdbcConfig;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJdbcConfig {

  @Test
  void testOnBorrow() {
    JdbcConfig jdbcConfig = new JdbcConfig(Maps.newHashMap());
    Assertions.assertTrue(jdbcConfig.getTestOnBorrow());

    ImmutableMap immutableMap = ImmutableMap.of("jdbc.pool.test-on-borrow", "false");
    jdbcConfig = new JdbcConfig(immutableMap);
    Assertions.assertFalse(jdbcConfig.getTestOnBorrow());
  }
}
