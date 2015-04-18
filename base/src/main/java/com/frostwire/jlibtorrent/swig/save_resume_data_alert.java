/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class save_resume_data_alert extends torrent_alert {
  private long swigCPtr;

  protected save_resume_data_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.save_resume_data_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(save_resume_data_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_save_resume_data_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public save_resume_data_alert(entry rd, torrent_handle h) {
    this(libtorrent_jni.new_save_resume_data_alert(entry.getCPtr(rd), rd, torrent_handle.getCPtr(h), h), true);
  }

  public int type() {
    return libtorrent_jni.save_resume_data_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.save_resume_data_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.save_resume_data_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.save_resume_data_alert_message(swigCPtr, this);
  }

  public boolean discardable() {
    return libtorrent_jni.save_resume_data_alert_discardable(swigCPtr, this);
  }

  public void setResume_data(entry value) {
    libtorrent_jni.save_resume_data_alert_resume_data_set(swigCPtr, this, entry.getCPtr(value), value);
  }

  public entry getResume_data() {
    long cPtr = libtorrent_jni.save_resume_data_alert_resume_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new entry(cPtr, true);
  }

  public final static int alert_type = libtorrent_jni.save_resume_data_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.save_resume_data_alert_static_category_get();
}
