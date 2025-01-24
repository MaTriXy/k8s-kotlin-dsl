// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AppArmorProfile as model_AppArmorProfile
import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext


fun  model_PodSecurityContext.`appArmorProfile`(block: model_AppArmorProfile.() -> Unit = {}) {
  if(this.`appArmorProfile` == null) {
    this.`appArmorProfile` = model_AppArmorProfile()
  }

  this.`appArmorProfile`.block()
}


fun  model_SecurityContext.`appArmorProfile`(block: model_AppArmorProfile.() -> Unit = {}) {
  if(this.`appArmorProfile` == null) {
    this.`appArmorProfile` = model_AppArmorProfile()
  }

  this.`appArmorProfile`.block()
}

