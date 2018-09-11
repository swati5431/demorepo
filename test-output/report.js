$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/swati.singh/officeworkspace/builder/src/main/java/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "workflow builder",
  "description": "",
  "id": "workflow-builder",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: DFDafe"
    },
    {
      "line": 4,
      "value": "#Given USER ON LOGIN PAGE df"
    },
    {
      "line": 5,
      "value": "#When i dnt knw"
    },
    {
      "line": 6,
      "value": "#Then Veriy new eligibilty created for next year"
    },
    {
      "line": 8,
      "value": "#@Regressiontest @Smoketest"
    },
    {
      "line": 9,
      "value": "#Scenario: DFDafee"
    },
    {
      "line": 10,
      "value": "#Given USER ON LOGIN PAGE dfee"
    },
    {
      "line": 11,
      "value": "#When i dnt knweee"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#@Smoketest"
    },
    {
      "line": 14,
      "value": "#Scenario: DFDafeee"
    },
    {
      "line": 15,
      "value": "#Given USER ON LOGIN PAGE dfeeee"
    },
    {
      "line": 16,
      "value": "#When i dnt knweeeeeee"
    }
  ],
  "line": 19,
  "name": "Create eligibility and run mh renewal batch job",
  "description": "",
  "id": "workflow-builder;create-eligibility-and-run-mh-renewal-batch-job",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "create eligibilty \"\u003cini\u003e\" and \"\u003ctimeline\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user Run\u0027s MH Renewal Batch jobs in year \"\u003cMHbatchjobtimeline\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Veriy new eligibilty created for next year",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "workflow-builder;create-eligibility-and-run-mh-renewal-batch-job;",
  "rows": [
    {
      "cells": [
        "ini",
        "timeline",
        "MHbatchjobtimeline"
      ],
      "line": 27,
      "id": "workflow-builder;create-eligibility-and-run-mh-renewal-batch-job;;1"
    },
    {
      "cells": [
        "xyz.ini",
        "04/01/2017",
        "02/10/2018"
      ],
      "line": 28,
      "id": "workflow-builder;create-eligibility-and-run-mh-renewal-batch-job;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 313846,
  "status": "passed"
});
formatter.before({
  "duration": 269537,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Create eligibility and run mh renewal batch job",
  "description": "",
  "id": "workflow-builder;create-eligibility-and-run-mh-renewal-batch-job;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "create eligibilty \"xyz.ini\" and \"04/01/2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user Run\u0027s MH Renewal Batch jobs in year \"02/10/2018\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Veriy new eligibilty created for next year",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xyz.ini",
      "offset": 19
    },
    {
      "val": "04/01/2017",
      "offset": 33
    }
  ],
  "location": "EligibiltystepDefinition.create_eligibilty_and(String,String)"
});
formatter.result({
  "duration": 395897367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/10/2018",
      "offset": 42
    }
  ],
  "location": "EligibiltystepDefinition.user_Run_s_MH_Renewal_Batch_jobs_in_year(String)"
});
formatter.result({
  "duration": 77949,
  "status": "passed"
});
formatter.match({
  "location": "EligibiltystepDefinition.veriy_new_eligibilty_created_for_next_year()"
});
formatter.result({
  "duration": 35692,
  "status": "passed"
});
formatter.after({
  "duration": 303999,
  "status": "passed"
});
formatter.after({
  "duration": 102564,
  "status": "passed"
});
});