// GENERATED
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDR as v1alpha1_ClusterCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRSpec as v1alpha1_ClusterCIDRSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec


fun  v1alpha1_ClusterCIDR.`spec`(block: v1alpha1_ClusterCIDRSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1alpha1_ClusterCIDRSpec()
  }

  this.`spec`.block()
}


fun  v1alpha1_IPAddress.`spec`(block: v1alpha1_IPAddressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1alpha1_IPAddressSpec()
  }

  this.`spec`.block()
}

