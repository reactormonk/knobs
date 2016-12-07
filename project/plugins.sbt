resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
    url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("io.verizon.build" % "sbt-rig" % "1.1.22")

// docs
addSbtPlugin("com.typesafe.sbt"  % "sbt-site"    % "0.8.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-ghpages" % "0.5.3")
addSbtPlugin("org.tpolecat"      % "tut-plugin"  % "0.4.7")
addSbtPlugin("com.eed3si9n"      % "sbt-unidoc"  % "0.3.2")

scalacOptions += "-deprecation"
