// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ParamKind as v1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicySpec as v1_ValidatingAdmissionPolicySpec


fun  v1_ValidatingAdmissionPolicySpec.`paramKind`(block: v1_ParamKind.() -> Unit = {}) {
  if(this.`paramKind` == null) {
    this.`paramKind` = v1_ParamKind()
  }

  this.`paramKind`.block()
}

