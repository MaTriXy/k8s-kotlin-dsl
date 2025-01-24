// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ExternalPlatformSpec as v1_ExternalPlatformSpec
import io.fabric8.openshift.api.model.config.v1.ExternalPlatformStatus as v1_ExternalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformNodeNetworking as v1_VSpherePlatformNodeNetworking
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformNodeNetworkingSpec as v1_VSpherePlatformNodeNetworkingSpec


fun  v1_PlatformSpec.`external`(block: v1_ExternalPlatformSpec.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v1_ExternalPlatformSpec()
  }

  this.`external`.block()
}


fun  v1_PlatformStatus.`external`(block: v1_ExternalPlatformStatus.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v1_ExternalPlatformStatus()
  }

  this.`external`.block()
}


fun  v1_VSpherePlatformNodeNetworking.`external`(block: v1_VSpherePlatformNodeNetworkingSpec.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v1_VSpherePlatformNodeNetworkingSpec()
  }

  this.`external`.block()
}

