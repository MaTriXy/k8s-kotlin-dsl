// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.NutanixPlatformSpec as v1_NutanixPlatformSpec
import io.fabric8.openshift.api.model.config.v1.NutanixPlatformStatus as v1_NutanixPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`nutanix`(block: v1_NutanixPlatformSpec.() -> Unit = {}) {
  if(this.`nutanix` == null) {
    this.`nutanix` = v1_NutanixPlatformSpec()
  }

  this.`nutanix`.block()
}


fun  v1_PlatformStatus.`nutanix`(block: v1_NutanixPlatformStatus.() -> Unit = {}) {
  if(this.`nutanix` == null) {
    this.`nutanix` = v1_NutanixPlatformStatus()
  }

  this.`nutanix`.block()
}

