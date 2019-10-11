/*
 * Copyright 2019 Karlsruhe Institute of Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.kit.datamanager.metastore2.web.impl;

import edu.kit.datamanager.metastore2.domain.MetadataSchemaRecord;
import edu.kit.datamanager.metastore2.web.ISchemaRegistryController;
import io.swagger.annotations.Api;
import java.time.Instant;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author jejkal
 */
@Controller
@RequestMapping(value = "/api/v1/schemas")
@Api(value = "Metadata Schema Registry")
public class SchemaRegistryControllerImpl implements ISchemaRegistryController{

  @Override
  public ResponseEntity<MetadataSchemaRecord> createRecord(MetadataSchemaRecord record, MultipartFile document, WebRequest request, HttpServletResponse response, UriComponentsBuilder uriBuilder){
    //check schema id and mimetype in record -> if not found HTTP BAD_REQUEST
    //find record for schemaid -> if found HTTP CONFLICT
    //check record type -> not found: guess according to document
    //try to read document according to type in record -> if fails HTTP BAD_REQUEST
    //persist document
    //update schemaDocumentUri in record 
    //set createdAt and lastUpdate to Instant.now()
    //persist record
    //return HTTP 201 with record
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResponseEntity<MetadataSchemaRecord> getRecordById(String id, Long version, WebRequest wr, HttpServletResponse hsr){
    //search for record with provided schemaId -> if not found HTTP NOT_FOUND
    //if versioning enabled, include version number -> if version not found, return HTTP NOT_FOUND
    //return HTTP 200 with record
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResponseEntity getSchemaDocumentById(String id, Long version, WebRequest wr, HttpServletResponse hsr){
    //search for record with provided schemaId -> if not found HTTP NOT_FOUND
    //if versioning enabled, include version number -> if version not found, return HTTP NOT_FOUND
    //obtain schemaDocumentUri from record -> if file not found return HTTP NOT_FOUND
    //return HTTP 200 with streamed file
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResponseEntity<List<MetadataSchemaRecord>> getRecords(List<String> schemaIds, List<String> mimeTypes, Instant updateFrom, Instant updateUntil, Pageable pgbl, WebRequest wr, HttpServletResponse hsr, UriComponentsBuilder ucb){
      //search for records with provided schemaIds AND mimeTypes including updateFrom and updateUntil for lastUpdate field
      //re
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResponseEntity<MetadataSchemaRecord> updateRecord(String id, MetadataSchemaRecord record, MultipartFile document, WebRequest request, HttpServletResponse response, UriComponentsBuilder uriBuilder){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResponseEntity deleteRecord(String id, WebRequest wr, HttpServletResponse hsr){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
