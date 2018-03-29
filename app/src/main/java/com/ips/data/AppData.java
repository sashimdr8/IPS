package com.ips.data;

import com.ips.data.local.LocalRepo;
import com.ips.data.remote.RemoteRepo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by brain on 1/8/18.
 */

@Singleton
public class AppData {
    private final LocalRepo localRepo;
    private final RemoteRepo remoteRepo;

    @Inject
    public AppData(LocalRepo localRepo, RemoteRepo remoteRepo) {
        this.localRepo = localRepo;
        this.remoteRepo = remoteRepo;
    }
}
