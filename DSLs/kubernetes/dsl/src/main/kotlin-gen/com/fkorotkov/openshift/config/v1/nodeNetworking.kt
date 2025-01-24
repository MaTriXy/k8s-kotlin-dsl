// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.VSpherePlatformNodeNetworking as v1_VSpherePlatformNodeNetworking
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformSpec as v1_VSpherePlatformSpec


fun  v1_VSpherePlatformSpec.`nodeNetworking`(block: v1_VSpherePlatformNodeNetworking.() -> Unit = {}) {
  if(this.`nodeNetworking` == null) {
    this.`nodeNetworking` = v1_VSpherePlatformNodeNetworking()
  }

  this.`nodeNetworking`.block()
}

