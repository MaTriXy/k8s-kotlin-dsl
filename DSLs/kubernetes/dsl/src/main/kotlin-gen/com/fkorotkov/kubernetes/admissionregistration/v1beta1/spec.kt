// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy as v1beta1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding as v1beta1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingSpec as v1beta1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec as v1beta1_ValidatingAdmissionPolicySpec


fun  v1beta1_ValidatingAdmissionPolicy.`spec`(block: v1beta1_ValidatingAdmissionPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_ValidatingAdmissionPolicySpec()
  }

  this.`spec`.block()
}


fun  v1beta1_ValidatingAdmissionPolicyBinding.`spec`(block: v1beta1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_ValidatingAdmissionPolicyBindingSpec()
  }

  this.`spec`.block()
}

