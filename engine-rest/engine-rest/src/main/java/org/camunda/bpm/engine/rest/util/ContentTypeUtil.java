/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.rest.util;

import javax.ws.rs.core.MediaType;

public class ContentTypeUtil {

  private static final String SUFFIX_JSON_FILE = ".json";

  /**
   * @return the content type to use for the provided form's key
   *
   */
  public static String getFormContentType(String formKey) {
    if (formKey.endsWith(SUFFIX_JSON_FILE)) {
      return MediaType.APPLICATION_JSON;
    }
    return MediaType.APPLICATION_XHTML_XML;
  }
}
