// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.thenewsfeedapp.di.modules;

import com.au.vimalprakash.thenewsfeedapp.NewsFeedApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Cache;

public final class SupportModules_ProvideOkHttpCacheFactory implements Factory<Cache> {
  private final SupportModules module;

  private final Provider<NewsFeedApplication> applicationProvider;

  public SupportModules_ProvideOkHttpCacheFactory(
      SupportModules module, Provider<NewsFeedApplication> applicationProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpCache(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(
      SupportModules module, Provider<NewsFeedApplication> applicationProvider) {
    return new SupportModules_ProvideOkHttpCacheFactory(module, applicationProvider);
  }

  /** Proxies {@link SupportModules#provideOkHttpCache(NewsFeedApplication)}. */
  public static Cache proxyProvideOkHttpCache(
      SupportModules instance, NewsFeedApplication application) {
    return instance.provideOkHttpCache(application);
  }
}
