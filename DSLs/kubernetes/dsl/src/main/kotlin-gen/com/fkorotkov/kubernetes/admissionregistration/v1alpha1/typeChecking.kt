// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.TypeChecking as v1alpha1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyStatus as v1alpha1_ValidatingAdmissionPolicyStatus


fun  v1alpha1_ValidatingAdmissionPolicyStatus.`typeChecking`(block: v1alpha1_TypeChecking.() -> Unit = {}) {
  if(this.`typeChecking` == null) {
    this.`typeChecking` = v1alpha1_TypeChecking()
  }

  this.`typeChecking`.block()
}

