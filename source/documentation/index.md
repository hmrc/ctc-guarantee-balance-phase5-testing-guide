---
title: CTC Guarantee Balance API phase 5 testing guide
weight: 1
description: Software developers, designers, product owners or business analysts. Verify the compatibility of your software with CTC Guarantee Balance API and learn how to test your application in our sandbox environment.
---

# CTC Guarantee Balance API phase 5 testing guide

Learn how to test the compatibility of your software with New Computerised Transit System phase 5 (NCTS5) and [CTC Guarantee Balance API v2.0](/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/2.0).

## Before you start

When you are ready to test your software, first read and understand the [CTC Guarantee Balance API phase 5 service guide](https://developer.service.hmrc.gov.uk/guides/ctc-guarantee-balance-phase5-service-guide/).

### Scheduling your testing

Before NCTS5 goes live on 16 November 2023, you will need to check that your software is compatible with both it and CTC Guarantee Balance API v2.0. This involves using test scenarios and predefined test data.

### Trader Test

Trader Test is a test environment that simulates both automated responses and real-life NCTS experience. This includes the Guarantee Management System (GMS) against which you will be able to run your tests.

For information about accessing the NCTS5 Trader Test environment, see [CTC Traders API phase 5 testing guide](/guides/ctc-traders-phase5-testing-guide/#accessing-trader-test). 

### Testing prerequisites

For information about actions that must be completed before testing, see the quick start section of the [CTC Guarantee Balance API phase 5 service guide](/guides/ctc-guarantee-balance-phase5-service-guide/#quick-start).

### UK cutover from NCTS4 to NCTS5

After NCTS5 goes live on 16 November 2023, there will be a cutover period that will affect in-flight and newly created transit declarations. For information about this, see [CTC Traders API phase 5 testing guide](/guides/ctc-traders-phase5-testing-guide/#uk-cutover-from-ncts4-to-ncts5).

However, the cutover period will not affect [CTC Guarantee Balance API v1.0](/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/1.0) or CTC Guarantee Balance API v2.0.

Instead, guarantees will be migrated from NCTS4 to NCTS5 while the UK NCTS4 service is still running, and the NCTS4 service will be used for any guarantee balance check calls to the GMS for the duration of the cutover period. After the cutover period ends on 30 November 2023, the UK NCTS5 service will be used for all guarantee balance check calls to the GMS.

## Related documentation

- CTC Guarantee Balance API roadmap (pending)
- [CTC Guarantee Balance API v2.0 documentation](/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/2.0)
- [CTC Guarantee Balance API v2.0 reference](/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/2.0)
- [CTC Guarantee Balance API v2.0 changelog](https://github.com/hmrc/common-transit-convention-guarantee-balance/wiki/CTC-Guarantee-Balance-API-v2.0-changelog) (GitHub)
- [CTC Guarantee Balance API phase 5 service guide](/guides/ctc-guarantee-balance-phase5-service-guide/)
- [CTC Traders API v2.0 documentation](/api-documentation/docs/api/service/common-transit-convention-traders/2.0)

## Getting help and support

Before contacting us, find out if there is planned API downtime or a technical issue by checking [HMRC API Platform Status](https://api-platform-status.production.tax.service.gov.uk/) and [New Computerised Transit System service availability](https://www.gov.uk/guidance/new-computerised-transit-system-service-availability).

If you have specific questions about the CTC Traders API, contact our Software Developer Support (SDS) Team. You’ll get an initial response within 2 working days.

You can also email questions to [SDSTeam@hmrc.gov.uk](mailto:SDSTeam@hmrc.gov.uk). We might ask for more detailed information when we respond.

## Changelog

You can find the changelog for this document in the [ctc-guarantee-balance-phase5-testing-guide](https://github.com/hmrc/ctc-guarantee-balance-phase5-testing-guide/wiki) GitHub wiki.
