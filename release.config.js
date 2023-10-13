const config = {
  branches: ['master'],
  plugins: [
    '@semantic-release/commit-analyzer',
    '@semantic-release/release-notes-generator',
    "gradle-semantic-release-plugin",
    ["@semantic-release/git", {
      "assets": ["build.gradle.kts"],
      "message": "snyk: ${nextRelease.version} [skip ci]\n\n${nextRelease.notes}"
    }],
    '@semantic-release/github'
  ]
};

module.exports = config;

