// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.VSpherePlatformNodeNetworking as v1_VSpherePlatformNodeNetworking
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformNodeNetworkingSpec as v1_VSpherePlatformNodeNetworkingSpec


fun  v1_VSpherePlatformNodeNetworking.`internal`(block: v1_VSpherePlatformNodeNetworkingSpec.() -> Unit = {}) {
  if(this.`internal` == null) {
    this.`internal` = v1_VSpherePlatformNodeNetworkingSpec()
  }

  this.`internal`.block()
}

