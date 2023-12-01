# ktor-sample

## References

https://ktor.io/docs/google-app-engine.html#prerequisites

## Prerequisites

Before starting this tutorial, you need to perform the steps below:

- Register in Google Cloud Platform.

- Install and initialize the Google Cloud SDK.

- Install the App Engine extension for Java with the following command:

```bash
gcloud components install app-engine-java
```

## Deploying to App Engine

1. Create a Google Cloud project

```bash
gcloud projects create [project-id] --set-as-default
```

2. Create an App Engine Application

```bash
gcloud app create
```

3. Deploy the app

```bash
./gradlew appengineDeploy
```

4. Enable billing

Make sure billing is enabled to avoid next error:

```bash
ERROR: (gcloud.app.deploy) Permissions error fetching application [apps/ktor-gobus-app-1234]. Please make sure that you have permission to view applications on the project and that jesus.daniel.medina.cruz@gmail.com has the App Engine Deployer (roles/appengine.deployer) role.
```

5. View the app

```bash
 gcloud app browse
```

6. View the logs

```bash
gcloud app logs tail -s default
```
