// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.TypeChecking as v1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyStatus as v1_ValidatingAdmissionPolicyStatus


fun  v1_ValidatingAdmissionPolicyStatus.`typeChecking`(block: v1_TypeChecking.() -> Unit = {}) {
  if(this.`typeChecking` == null) {
    this.`typeChecking` = v1_TypeChecking()
  }

  this.`typeChecking`.block()
}

