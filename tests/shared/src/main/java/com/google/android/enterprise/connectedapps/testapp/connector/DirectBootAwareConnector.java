/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.enterprise.connectedapps.testapp.connector;

import android.content.Context;
import com.google.android.enterprise.connectedapps.ProfileConnector;
import com.google.android.enterprise.connectedapps.annotations.AvailabilityRestrictions;
import com.google.android.enterprise.connectedapps.annotations.CustomProfileConnector;
import com.google.android.enterprise.connectedapps.annotations.GeneratedProfileConnector;
import java.util.concurrent.ScheduledExecutorService;

@GeneratedProfileConnector
@CustomProfileConnector(availabilityRestrictions = AvailabilityRestrictions.DIRECT_BOOT_AWARE)
public interface DirectBootAwareConnector extends ProfileConnector {
  static DirectBootAwareConnector create(Context context) {
    return GeneratedDirectBootAwareConnector.builder(context).build();
  }

  static DirectBootAwareConnector create(
      Context context, ScheduledExecutorService scheduledExecutorService) {
    return GeneratedDirectBootAwareConnector.builder(context)
        .setScheduledExecutorService(scheduledExecutorService)
        .build();
  }
}
