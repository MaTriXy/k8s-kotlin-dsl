// GENERATED
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ParentReference as v1alpha1_ParentReference


fun  v1alpha1_IPAddressSpec.`parentRef`(block: v1alpha1_ParentReference.() -> Unit = {}) {
  if(this.`parentRef` == null) {
    this.`parentRef` = v1alpha1_ParentReference()
  }

  this.`parentRef`.block()
}

