package com.hypersoft.permissions.utilities.base

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding>(bindingFactory: (LayoutInflater) -> T) : ParentActivity<T>(bindingFactory) {

}