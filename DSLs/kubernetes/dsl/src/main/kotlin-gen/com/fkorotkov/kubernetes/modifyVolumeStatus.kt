// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ModifyVolumeStatus as model_ModifyVolumeStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus as model_PersistentVolumeClaimStatus


fun  model_PersistentVolumeClaimStatus.`modifyVolumeStatus`(block: model_ModifyVolumeStatus.() -> Unit = {}) {
  if(this.`modifyVolumeStatus` == null) {
    this.`modifyVolumeStatus` = model_ModifyVolumeStatus()
  }

  this.`modifyVolumeStatus`.block()
}

