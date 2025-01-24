// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.CSIVolumeSource as model_CSIVolumeSource
import io.fabric8.openshift.api.model.BuildVolumeSource as model_BuildVolumeSource


fun  model_BuildVolumeSource.`csi`(block: model_CSIVolumeSource.() -> Unit = {}) {
  if(this.`csi` == null) {
    this.`csi` = model_CSIVolumeSource()
  }

  this.`csi`.block()
}

