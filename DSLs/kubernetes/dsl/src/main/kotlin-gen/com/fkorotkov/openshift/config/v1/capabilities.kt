// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ClusterVersionCapabilitiesSpec as v1_ClusterVersionCapabilitiesSpec
import io.fabric8.openshift.api.model.config.v1.ClusterVersionCapabilitiesStatus as v1_ClusterVersionCapabilitiesStatus
import io.fabric8.openshift.api.model.config.v1.ClusterVersionSpec as v1_ClusterVersionSpec
import io.fabric8.openshift.api.model.config.v1.ClusterVersionStatus as v1_ClusterVersionStatus


fun  v1_ClusterVersionSpec.`capabilities`(block: v1_ClusterVersionCapabilitiesSpec.() -> Unit = {}) {
  if(this.`capabilities` == null) {
    this.`capabilities` = v1_ClusterVersionCapabilitiesSpec()
  }

  this.`capabilities`.block()
}


fun  v1_ClusterVersionStatus.`capabilities`(block: v1_ClusterVersionCapabilitiesStatus.() -> Unit = {}) {
  if(this.`capabilities` == null) {
    this.`capabilities` = v1_ClusterVersionCapabilitiesStatus()
  }

  this.`capabilities`.block()
}

