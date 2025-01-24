// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ClusterTrustBundleProjection as model_ClusterTrustBundleProjection
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection


fun  model_VolumeProjection.`clusterTrustBundle`(block: model_ClusterTrustBundleProjection.() -> Unit = {}) {
  if(this.`clusterTrustBundle` == null) {
    this.`clusterTrustBundle` = model_ClusterTrustBundleProjection()
  }

  this.`clusterTrustBundle`.block()
}

