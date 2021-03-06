package org.elasticmq.rest.sqs

import Constants._
import org.elasticmq.rest.sqs.directives.ElasticMQDirectives

trait GetQueueUrlDirectives { this: ElasticMQDirectives with QueueURLModule =>
  val getQueueUrl = {
    action("GetQueueUrl") {
      rootPath {
        queueDataFromParams { queueData =>
          respondWith {
            <GetQueueUrlResponse>
              <GetQueueUrlResult>
                <QueueUrl>{queueURL(queueData)}</QueueUrl>
              </GetQueueUrlResult>
              <ResponseMetadata>
                <RequestId>{EmptyRequestId}</RequestId>
              </ResponseMetadata>
            </GetQueueUrlResponse>
          }
        }
      }
    }
  }
}