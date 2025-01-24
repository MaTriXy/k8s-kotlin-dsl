// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.CloudControllerManagerStatus as v1_CloudControllerManagerStatus
import io.fabric8.openshift.api.model.config.v1.ExternalPlatformStatus as v1_ExternalPlatformStatus


fun  v1_ExternalPlatformStatus.`cloudControllerManager`(block: v1_CloudControllerManagerStatus.() -> Unit = {}) {
  if(this.`cloudControllerManager` == null) {
    this.`cloudControllerManager` = v1_CloudControllerManagerStatus()
  }

  this.`cloudControllerManager`.block()
}

