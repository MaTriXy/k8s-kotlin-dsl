// GENERATED
package com.fkorotkov.kubernetes.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigration as v1alpha1_StorageVersionMigration
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationStatus as v1alpha1_StorageVersionMigrationStatus


fun  v1alpha1_StorageVersionMigration.`status`(block: v1alpha1_StorageVersionMigrationStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1alpha1_StorageVersionMigrationStatus()
  }

  this.`status`.block()
}

