// GENERATED
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDR as v1alpha1_ServiceCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRStatus as v1alpha1_ServiceCIDRStatus


fun  v1alpha1_ServiceCIDR.`status`(block: v1alpha1_ServiceCIDRStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1alpha1_ServiceCIDRStatus()
  }

  this.`status`.block()
}

