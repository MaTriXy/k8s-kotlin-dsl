// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.VSpherePlatformFailureDomainSpec as v1_VSpherePlatformFailureDomainSpec
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformTopology as v1_VSpherePlatformTopology


fun  v1_VSpherePlatformFailureDomainSpec.`topology`(block: v1_VSpherePlatformTopology.() -> Unit = {}) {
  if(this.`topology` == null) {
    this.`topology` = v1_VSpherePlatformTopology()
  }

  this.`topology`.block()
}

