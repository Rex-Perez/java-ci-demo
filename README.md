# Java CI Demo

A small Java 17 + Maven + JUnit 5 project with GitHub Actions CI and optional SonarQube Cloud analysis.

## Local run

```bash
mvn clean verify
```

## GitHub Actions

Push to `main` or open a pull request against `main`. GitHub Actions builds and tests automatically.

## Optional SonarQube Cloud

Import this repository in SonarQube Cloud, then configure GitHub Actions:
- Repository secret: `SONAR_TOKEN`
- Repository variable: `SONAR_PROJECT_KEY`
- Repository variable: `SONAR_ORGANIZATION`

The Sonar step is skipped when SONAR_TOKEN is not set. On fork pull requests, secrets may not be available, so analysis can be skipped.

## Experiment

Change `1 - discountPercent / 100` to `1 + discountPercent / 100` in the production class. Commit and push. The tests should fail. Fix it and push again.

## Notes

This demonstrates CI, not deployment. The SonarQube Quality Gate result fails the job if analysis is run and the gate fails, but merge blocking requires branch protection/rulesets in GitHub.
