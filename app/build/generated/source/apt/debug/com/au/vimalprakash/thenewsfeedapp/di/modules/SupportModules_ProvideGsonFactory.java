// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.thenewsfeedapp.di.modules;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class SupportModules_ProvideGsonFactory implements Factory<Gson> {
  private final SupportModules module;

  public SupportModules_ProvideGsonFactory(SupportModules module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Gson> create(SupportModules module) {
    return new SupportModules_ProvideGsonFactory(module);
  }

  /** Proxies {@link SupportModules#provideGson()}. */
  public static Gson proxyProvideGson(SupportModules instance) {
    return instance.provideGson();
  }
}
